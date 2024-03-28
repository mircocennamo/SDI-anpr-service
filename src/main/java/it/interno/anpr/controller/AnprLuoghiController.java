package it.interno.anpr.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import it.interno.anpr.dto.TArchivioComuniDto;
import it.interno.anpr.dto.TStatiEsteriDto;
import it.interno.anpr.service.TArchivioComuniService;
import it.interno.anpr.service.TStatiEsteriService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/luoghi")
public class AnprLuoghiController {

    private final TArchivioComuniService tArchivioComuniService;
    private final TStatiEsteriService getStatiEsteriService;

    public AnprLuoghiController(TArchivioComuniService tArchivioComuniService, TStatiEsteriService getStatiEsteriService) {
        this.tArchivioComuniService = tArchivioComuniService;
        this.getStatiEsteriService = getStatiEsteriService;
    }


    @Operation(description = "API per recuperare i comuni filtrando per descrizione e data ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Dati recuperati correttamente"),
            @ApiResponse(responseCode = "404", description = "Url non definita"),
            @ApiResponse(responseCode = "500", description = "Errore del sistema") })
    @GetMapping(path = "/comuni")
    public ResponseEntity<List<TArchivioComuniDto>> getComuni(@RequestParam String descrizioneComune, @RequestParam String data) {
        List<TArchivioComuniDto> comuni = tArchivioComuniService.getComuni(descrizioneComune, data);
        return ResponseEntity.ok(comuni);
    }


    @Operation(description = "API per recuperare gli stati esteri filtrando per denominazione e data ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Dati recuperati correttamente"),
            @ApiResponse(responseCode = "404", description = "Url non definita"),
            @ApiResponse(responseCode = "500", description = "Errore del sistema") })
    @GetMapping(path = "/stati-esteri")
    public ResponseEntity<List<TStatiEsteriDto>> getStatiEsteri(@RequestParam String denominazione, @RequestParam String data) {

        List<TStatiEsteriDto> statiEsteri = getStatiEsteriService.getStatiEsteri(denominazione, data);
        return ResponseEntity.ok(statiEsteri);
    }
}
