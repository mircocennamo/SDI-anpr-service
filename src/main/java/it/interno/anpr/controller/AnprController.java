package it.interno.anpr.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import it.interno.anpr.dto.E002ConsultazioneDto;
import it.interno.anpr.service.AnprService;
import it.interno.anpr.ws._e000vocabolario.RispostaE002;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AnprController {

    private final AnprService anprService;



    public AnprController(AnprService anprService) {
        this.anprService = anprService;
    }

    @Operation(description = "Api per invocazione del servizio ANPR E001ScaricoTabelle")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Servizio E001 invocato correttamente"),
            @ApiResponse(responseCode = "500", description = "Errore nell'invocazione del servizio ANPR E001")
    })
    @PostMapping(path = "/e001ScaricoTabelle/{idTabella}")
    public ResponseEntity<?> scaricoTabelle(@PathVariable("idTabella") String idTabella) throws Exception {
        return ResponseEntity.ok(anprService.scaricaTabelle(idTabella));
    }

    @Operation(description = "Api per invocazione del servizio ANPR E002Consultazione")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Servizio E002 invocato correttamente"),
            @ApiResponse(responseCode = "500", description = "Errore nell'invocazione del servizio ANPR E003")
    })
    @PostMapping(path = "/e002Consultazione")
    public ResponseEntity<?> consultazioneSoggetti(@RequestBody @Valid E002ConsultazioneDto e002ConsultazioneDto) throws Exception {

        RispostaE002 rispostaE002 = anprService.consultazioneSoggetti(e002ConsultazioneDto);
        return ResponseEntity.ok(rispostaE002);
    }
}
