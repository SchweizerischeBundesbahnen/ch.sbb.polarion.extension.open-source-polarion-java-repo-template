package ch.sbb.polarion.extension.open_source_polarion_java_repo_template.integration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

import ch.sbb.polarion.extension.open_source_polarion_java_repo_template.rest.controller.OpenAPIInfo;

@DisplayName("Extension Integration Tests")
class ExtensionIntegrationTest {

    @Test
    @DisplayName("Extension should load without errors")
    void shouldLoadWithoutErrors() {
        assertDoesNotThrow(() -> {
            OpenAPIInfo openAPIInfo = new OpenAPIInfo();
            assertNotNull(openAPIInfo, "OpenAPIInfo should be instantiated");
        }, "Extension should load without throwing exceptions");
    }

    @Test
    @Disabled("Enable when running in Polarion environment")
    @DisplayName("Extension should integrate with Polarion REST framework")
    void shouldIntegrateWithPolarionRestFramework() {
        fail("This test requires a running Polarion instance");
    }

    @Test
    @DisplayName("Extension should have valid OpenAPI configuration")
    void shouldHaveValidOpenAPIConfiguration() {
        OpenAPIInfo openAPIInfo = new OpenAPIInfo();
        Class<?> clazz = openAPIInfo.getClass();

        assertTrue(clazz.isAnnotationPresent(io.swagger.v3.oas.annotations.OpenAPIDefinition.class),
                  "Extension should have OpenAPI definition for REST documentation");
    }
}
