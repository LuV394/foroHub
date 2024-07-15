package foroHub.api.domain.topico;

import foroHub.api.infra.errores.ValidacionDeIntegridad;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public Topico registrarTopico(DatosRegistroTopico datosRegistroTopico) {
        Optional<Topico> existente = topicoRepository.findByTituloAndMensaje(datosRegistroTopico.titulo(), datosRegistroTopico.mensaje());
        if (existente.isPresent()) {
            throw new ValidacionDeIntegridad("El tópico con el mismo título y mensaje ya existe.");
        }
        Topico topico = new Topico(datosRegistroTopico);
        return topicoRepository.save(topico);
    }
    public Topico actualizarTopico(Long id, DatosActualizarTopico datosActualizarTopico) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new ValidacionDeIntegridad("ID no encontrado: " + id));

        topico.actualizarTopico(datosActualizarTopico);
        return topicoRepository.save(topico);
    }

    public Topico eliminarTopico(Long id) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico no encontrado"));
        topicoRepository.deleteById(id);
        return topico;
    }

    public Topico obtenerTopicoPorId(Long id) {
        return topicoRepository.findById(id)
                .orElseThrow(() -> new ValidacionDeIntegridad("ID no encontrado: " + id));
    }

}