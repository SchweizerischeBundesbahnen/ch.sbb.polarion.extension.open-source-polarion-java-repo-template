package ch.sbb.polarion.extension.open_source_polarion_java_repo_template;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import ch.sbb.polarion.extension.open_source_polarion_java_repo_template.rest.controller.OpenAPIInfo;

class ProjectStructureTest {

    @Test
    @DisplayName("Project should have correct package structure")
    void shouldHaveCorrectPackageStructure() {
        String expectedBasePackage = "ch.sbb.polarion.extension.open_source_polarion_java_repo_template";
        String expectedControllerPackage = expectedBasePackage + ".rest.controller";

        OpenAPIInfo openAPIInfo = new OpenAPIInfo();
        assertEquals(expectedControllerPackage, openAPIInfo.getClass().getPackage().getName(),
                    "Controller classes should be in the correct package");
    }

    @Test
    @DisplayName("REST controller classes should be accessible")
    void shouldHaveAccessibleRestControllers() {
        assertDoesNotThrow(() -> {
            Class.forName("ch.sbb.polarion.extension.open_source_polarion_java_repo_template.rest.controller.OpenAPIInfo");
        }, "OpenAPIInfo controller should be accessible");
    }

    @Test
    @DisplayName("Package naming should follow convention")
    void shouldFollowPackageNamingConvention() {
        String packageName = OpenAPIInfo.class.getPackage().getName();
        assertTrue(packageName.startsWith("ch.sbb.polarion.extension"),
                  "Package should start with SBB Polarion extension prefix");
        assertTrue(packageName.contains("open_source_polarion_java_repo_template"),
                  "Package should contain the project identifier with underscores");
        assertTrue(packageName.endsWith("rest.controller"),
                  "Controller package should end with rest.controller");
    }
}
