package com.uniandes.grafos.grafos.grafo;

import com.uniandes.grafos.grafos.arco.Arco;
import com.uniandes.grafos.grafos.nodo.Nodo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Grafo {
    protected List<Nodo> nodos;
    protected List<Arco> arcos;


    public void addNodo(String nombre) {
        Nodo nodo = new Nodo();
        nodo.setNombre(nombre);
        nodos.add(nodo);
    }

    public void addArco(String origen, String destino) throws Exception {

        Nodo nodoOrigen = buscarNodo(origen);
        Nodo nodoDestino = buscarNodo(destino);

        // Origen o destino no encontrado
        if (nodoOrigen == null) {

            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }
        if (nodoDestino == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }

        addArco(nodoOrigen, nodoDestino);
    }

    public void addArco(Nodo nodoOrigen, Nodo nodoDestino) {
        Arco arco = new Arco();
        arco.setOrigen(nodoOrigen);
        arco.setDestino(nodoDestino);
        arcos.add(arco);
        nodoOrigen.agregarArco(arco);

        arco = new Arco();
        arco.setOrigen(nodoDestino);
        arco.setDestino(nodoOrigen);
        arcos.add(arco);
        nodoDestino.agregarArco(arco);
    }

    public Nodo buscarNodo(String nombre) {
        for (Nodo nodo : nodos) {
            if (nodo.getNombre().equals(nombre)) {
                return nodo;
            }
        }
        return null;
    }

}
