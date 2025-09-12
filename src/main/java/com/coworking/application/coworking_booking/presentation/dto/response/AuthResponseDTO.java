package com.coworking.application.coworking_booking.presentation.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(description = "DTO de respuesta para operaciones de autenticación")
public class AuthResponseDTO {

    @Schema(
            description = "Token JWT para autenticación",
            example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
    )
    private String accessToken;

    @Schema(
            description = "Tipo de token",
            example = "Bearer"
    )
    private String tokenType = "Bearer";

    @Schema(
            description = "Tiempo de expiración del token en segundos",
            example = "3600"
    )
    private Long expiresIn;

    @Schema(
            description = "Fecha y hora de expiración del token",
            example = "2024-12-10T15:30:00"
    )
    private LocalDateTime expiresAt;

    @Schema(description = "Información básica del usuario autenticado")
    private UserSummaryDTO user;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Schema(description = "Resumen de información del usuario")
    public static class UserSummaryDTO {

        @Schema(description = "ID único del usuario", example = "1")
        private Long id;

        @Schema(description = "Email del usuario", example = "usuario@example.com")
        private String email;

        @Schema(description = "Nombre completo del usuario", example = "Juan Pérez")
        private String fullName;

        @Schema(description = "Rol del usuario", example = "USER")
        private String role;

        @Schema(description = "Indica si la cuenta está activa", example = "true")
        private boolean active;
    }
}