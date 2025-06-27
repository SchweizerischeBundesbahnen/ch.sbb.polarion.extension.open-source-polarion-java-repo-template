package ch.sbb.polarion.extension.open_source_polarion_java_repo_template.rest.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import java.lang.annotation.Annotation;

class OpenAPIInfoTest {

    @Test
    @DisplayName("OpenAPIInfo class should have OpenAPIDefinition annotation")
    void shouldHaveOpenAPIDefinitionAnnotation() {
        OpenAPIInfo openAPIInfo = new OpenAPIInfo();

        Class<?> clazz = openAPIInfo.getClass();
        assertTrue(clazz.isAnnotationPresent(OpenAPIDefinition.class),
                  "OpenAPIInfo class should be annotated with @OpenAPIDefinition");
    }

    @Test
    @DisplayName("OpenAPIDefinition should have correct Info annotation values")
    void shouldHaveCorrectInfoAnnotationValues() {
        OpenAPIInfo openAPIInfo = new OpenAPIInfo();
        Class<?> clazz = openAPIInfo.getClass();

        OpenAPIDefinition openAPIDefinition = clazz.getAnnotation(OpenAPIDefinition.class);
        assertNotNull(openAPIDefinition, "OpenAPIDefinition annotation should not be null");

        Info info = openAPIDefinition.info();
        assertNotNull(info, "Info annotation should not be null");

        assertEquals("open-source-polarion-java-repo-template REST API", info.title(),
                    "API title should match expected value");
        assertEquals("v1", info.version(),
                    "API version should be v1");
        assertNotNull(info.description(), "Description should not be null");
        assertNotNull(info.termsOfService(), "Terms of service should not be null");
        assertNotNull(info.contact(), "Contact should not be null");
        assertNotNull(info.license(), "License should not be null");
    }

    @Test
    @DisplayName("OpenAPIInfo class should be instantiable")
    void shouldBeInstantiable() {
        assertDoesNotThrow(() -> new OpenAPIInfo(),
                          "OpenAPIInfo should be instantiable without throwing exceptions");
    }

    @Test
    @DisplayName("OpenAPIInfo class should be in correct package")
    void shouldBeInCorrectPackage() {
        OpenAPIInfo openAPIInfo = new OpenAPIInfo();
        String expectedPackage = "ch.sbb.polarion.extension.open_source_polarion_java_repo_template.rest.controller";
        assertEquals(expectedPackage, openAPIInfo.getClass().getPackage().getName(),
                    "OpenAPIInfo should be in the correct package");
    }
}
