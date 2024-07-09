package foroHub.api.controller;

import foroHub.api.domain.topico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class ForoController {

    @Autowired
    private TopicoService topicoService;

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<?> registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico) {
        Topico topico = topicoService.registrarTopico(datosRegistroTopico);
        return ResponseEntity.ok().body(new DatosDetalleTopico(topico));
    }



    @GetMapping
    public ResponseEntity<Page<DatosListadoTopicos>> listartopicos(
            @PageableDefault(size = 10, sort = "fechaCreacion", direction = Sort.Direction.ASC) Pageable paginacion
    ) {
        return ResponseEntity.ok().body(
                topicoRepository.findAll(paginacion).map(DatosListadoTopicos::new)
        );
    }

}
