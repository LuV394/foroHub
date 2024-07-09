package foroHub.api.domain.topico;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        StatusTopico status,
        String autor,
        String curso){

}