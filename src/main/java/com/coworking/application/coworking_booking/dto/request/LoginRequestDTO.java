package com.coworking.application.coworking_booking.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO para solicitud de inicio de sesión")
public class LoginRequestDTO {

    @Schema(
            description = "Email del usuario",
            example = "usuario@example.com",
            required = true
    )
    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El email debe tener un formato válido")
    @Size(max = 100, message = "El email no puede exceder los 100 caracteres")
    private String email;

    @Schema(
            description = "Contraseña del usuario",
            example = "miPassword123",
            required = true,
            minLength = 6,
            maxLength = 50
    )
    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 6, max = 50, message = "La contraseña debe tener entre 6 y 50 caracteres")
    private String password;

    @Schema(
            description = "Indica si el usuario quiere mantener la sesión activa",
            example = "true",
            defaultValue = "false"
    )
    private boolean rememberMe = false;
}