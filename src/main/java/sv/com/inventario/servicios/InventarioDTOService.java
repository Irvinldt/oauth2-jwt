package sv.com.inventario.servicios;

import java.util.List;

import sv.com.inventario.controladores.dto.request.InventarioRequestDTO;

public interface InventarioDTOService {

	List<InventarioRequestDTO> consTodo();
	
    InventarioRequestDTO actuInventario(InventarioRequestDTO request);
    
    InventarioRequestDTO consInventario(Long id);

    InventarioRequestDTO guarInventario(InventarioRequestDTO request);
	
}
