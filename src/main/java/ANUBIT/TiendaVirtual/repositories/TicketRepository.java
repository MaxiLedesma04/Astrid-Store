package ANUBIT.TiendaVirtual.repositories;

import ANUBIT.TiendaVirtual.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
