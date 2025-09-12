package com.coworking.application.coworking_booking.presentation.controller;

import com.coworking.application.coworking_booking.presentation.dto.request.CreateUserRequestDTO;
import com.coworking.application.coworking_booking.presentation.dto.response.UserResponseDTO;
import com.coworking.application.coworking_booking.presentation.dto.response.PageResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Tag(name = "Usuarios", description = "Operaciones relacionadas con la gestión de usuarios")
@SecurityRequirement(name = "bearerAuth")
public class UserController {

    @Operation(
            summary = "Crear nuevo usuario",
            description = "Crea un nuevo usuario en el sistema con la información proporcionada"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Usuario creado exitosamente",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserResponseDTO.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Datos de entrada inválidos",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "409",
                    description = "El usuario ya existe",
                    content = @Content
            )
    })
    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(
            @Valid @RequestBody CreateUserRequestDTO request) {
        // Implementación del método
        return null;
    }

    @Operation(
            summary = "Obtener todos los usuarios",
            description = "Obtiene una lista paginada de todos los usuarios del sistema"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Lista de usuarios obtenida exitosamente",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = PageResponseDTO.class)
                    )
            )
    })
    @GetMapping
    public ResponseEntity<?> getAllUsers(
            @Parameter(description = "Parámetros de paginación")
            Pageable pageable) {
        // Implementación del método
        return null;
    }

    @Operation(
            summary = "Obtener usuario por ID",
            description = "Obtiene la información de un usuario específico por su ID"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Usuario encontrado",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserResponseDTO.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Usuario no encontrado",
                    content = @Content
            )
    })
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(
            @Parameter(description = "ID del usuario", required = true, example = "1")
            @PathVariable Long id) {
        // Implementación del método
        return null;
    }

    @Operation(
            summary = "Actualizar usuario",
            description = "Actualiza la información de un usuario existente"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Usuario actualizado exitosamente",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserResponseDTO.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Usuario no encontrado",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Datos de entrada inválidos",
                    content = @Content
            )
    })
    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(
            @Parameter(description = "ID del usuario", required = true, example = "1")
            @PathVariable Long id,
            @Valid @RequestBody CreateUserRequestDTO request) {
        // Implementación del método
        return null;
    }

    @Operation(
            summary = "Eliminar usuario",
            description = "Elimina un usuario del sistema por su ID"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "204",
                    description = "Usuario eliminado exitosamente"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Usuario no encontrado",
                    content = @Content
            )
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(
            @Parameter(description = "ID del usuario", required = true, example = "1")
            @PathVariable Long id) {
        // Implementación del método
        return null;
    }
}