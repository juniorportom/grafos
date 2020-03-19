package com.uniandes.grafos.grafos.grafo;

import com.uniandes.grafos.grafos.arco.Arco;
import com.uniandes.grafos.grafos.nodo.Nodo;

public class GrafoDirigidoConPeso extends GrafoDFS {

    @Override
    public void addArco(Nodo nodoOrigen, Nodo nodoDestino) {
        Arco arco = new Arco();
        arco.setOrigen(nodoOrigen);
        arco.setDestino(nodoDestino);
        arcos.add(arco);
        nodoOrigen.agregarArco(arco);
    }

    public void addArco(String origen, String destino, int peso) throws Exception {
        Nodo nodoOrigen = buscarNodo(origen);
        Nodo nodoDestino = buscarNodo(destino);

        // Origen o destino no encontrado
        if (nodoOrigen == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }
        if (nodoDestino == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }

        addArco(nodoOrigen, nodoDestino, peso);
    }

    public void addArco(Nodo nodoOrigen, Nodo nodoDestino, int peso) {
        Arco arco = new Arco();
        arco.setOrigen(nodoOrigen);
        arco.setDestino(nodoDestino);
        arco.setPeso(peso);
        arcos.add(arco);
        nodoOrigen.agregarArco(arco);
    }


}
