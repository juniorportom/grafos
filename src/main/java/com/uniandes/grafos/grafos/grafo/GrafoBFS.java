package com.uniandes.grafos.grafos.grafo;

import com.uniandes.grafos.grafos.nodo.Nodo;
import com.uniandes.grafos.grafos.nodo.NodoBase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class GrafoBFS extends Grafo {

    public boolean existeRuta(String origen, String destino) throws Exception {
        if (buscarRuta(origen, destino) != null) {
            return true;
        }
        return false;
    }

    public List<Nodo> buscarRuta(String origen, String destino) throws Exception {

        Nodo nodoOrigen = buscarNodo(origen);
        Nodo nodoDestino = buscarNodo(destino);
        List<Nodo> nodosRuta = new ArrayList<>();

        // Origen o destino no encontrado
        if (nodoOrigen == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }
        if (nodoDestino == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }

        if (buscarRutaBFS(nodosRuta, nodoOrigen, nodoDestino)) {
            return nodosRuta;
        } else {
            return null;
        }
    }

    private boolean buscarRutaBFS(List<Nodo> nodosRuta, Nodo nodoOrigen, Nodo nodoDestino) {

        // origen y destino son el mismo ?
        if (nodoOrigen.getNombre().equals(nodoDestino.getNombre())) {
            System.err.println("Nodo destino encontrado en el mismo nodo origen");
            nodosRuta.add(nodoOrigen);
            return true;
        }

        // si no son el mismo, revise las rutas usando una cola
        Queue<Nodo> queue = new LinkedList<>();
        ArrayList<Nodo> nodosVisitados = new ArrayList<>();

        queue.add(nodoOrigen);
        nodosVisitados.add(nodoOrigen);

        while (!queue.isEmpty()) {

            Nodo actual = queue.remove();
            if (actual.equals(nodoDestino)) {
                nodosRuta.add(actual);
                return true;
            } else {
                if (actual.getNodosAdyacentes().isEmpty())
                    return false;
                else {
                    for (NodoBase nodo : actual.getNodosAdyacentes()) {
                        if (!nodosVisitados.contains(nodo))
                            queue.add((Nodo) nodo);
                    }
                }

            }
            if (!nodosRuta.contains(actual))
                nodosRuta.add(actual);
        }

        return false;
    }
}
