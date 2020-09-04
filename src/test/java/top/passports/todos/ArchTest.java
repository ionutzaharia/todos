package top.passports.todos;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("top.passports.todos");

        noClasses()
            .that()
            .resideInAnyPackage("top.passports.todos.service..")
            .or()
            .resideInAnyPackage("top.passports.todos.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..top.passports.todos.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
