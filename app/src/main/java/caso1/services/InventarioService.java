package caso1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import caso1.model.Producto;

public class InventarioService {
    
    private List<Producto> productos=new ArrayList<>();

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public  void eliminarProducto(String codigo){
        productos.removeIf(p -> p.getCodigo().equals(codigo));
    }

    public void mostrarInventario(){
     if(productos.isEmpty()){
         System.out.println("El inventario está vacío.");
         return;
     }
     productos.forEach(Producto::mostrarProducto);
    }

    public Optional<Producto> buscarProducto(String codigo){
        return productos.stream().filter(p -> p.getCodigo().endsWith(codigo)).findFirst();
    }

    public void actualizarProducto(String codigo, Producto nuevoProducto){
        Optional<Producto> existente=buscarProducto(codigo);
        existente.ifPresent(p -> {
            p.setNombre(nuevoProducto.getNombre());
            p.setPrecio(nuevoProducto.getPrecio());
            p.setCantidad(nuevoProducto.getCantidad());
        });
    }
        

}
