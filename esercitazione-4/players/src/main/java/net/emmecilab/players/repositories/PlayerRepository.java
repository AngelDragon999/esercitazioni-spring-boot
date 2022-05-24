package net.emmecilab.players.repositories;

import net.emmecilab.players.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mauro Cicolella
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> { // TIPO OGGETTI TRATTATI + TIPO ID

	//INTERFACCIA CHE DISPONE DI MOLTI METODI GIA' INTEGRATI MA COMUNQUE C'E' LA POSSIBILITA' DI AGGIUNGERNE NUOVE
}
