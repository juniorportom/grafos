package com.uniandes.grafos.grafos;

import com.uniandes.grafos.grafos.arco.Arco;
import com.uniandes.grafos.grafos.grafo.*;
import com.uniandes.grafos.grafos.nodo.Nodo;
import com.uniandes.grafos.grafos.ruta.Ruta;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class GrafoPruebas {
    private List<Nodo> nodos = new ArrayList<>();
    private List<Arco> arcos = new ArrayList<>();
    private List<Ruta> rutas = new ArrayList<>();
    private List<Nodo> caminos = new ArrayList<>();
    private String tipoGrafo;

    public void crearGrafo() {
        try {
            if (this.tipoGrafo.equals("GRAFO_BASICO")) {
                GrafoBasico grafoBasico = new GrafoBasico();
                for (Nodo nodo : this.nodos) {
                    grafoBasico.addNodo(nodo.getNombre());
                }
                for (Arco arco : this.arcos) {
                    grafoBasico.addArco(arco.getOrigen().getNombre(), arco.getDestino().getNombre());
                }

                for (Ruta ruta : this.rutas) {
                    this.caminos = grafoBasico.buscarRuta(ruta.getInicio().getNombre(), ruta.getFin().getNombre());
                }
            } else {
                if (this.tipoGrafo.equals("GRAFO_DIRIGIDO")) {
                    GrafoDirigido grafoDirigido = new GrafoDirigido();
                    for (Nodo nodo : this.nodos) {
                        grafoDirigido.addNodo(nodo.getNombre());
                    }
                    for (Arco arco : this.arcos) {
                        grafoDirigido.addArco(arco.getOrigen().getNombre(), arco.getDestino().getNombre());
                    }
                    for (Ruta ruta : this.rutas) {
                        this.caminos = grafoDirigido.buscarRuta(ruta.getInicio().getNombre(), ruta.getFin().getNombre());
                    }
                } else {
                    if (this.tipoGrafo.equals("GRAFO_DIRIGIDO_CON_PESO")) {
                        GrafoDirigidoConPeso grafoDirigidoConPeso = new GrafoDirigidoConPeso();
                        for (Nodo nodo : this.nodos) {
                            grafoDirigidoConPeso.addNodo(nodo.getNombre());
                        }
                        for (Arco arco : this.arcos) {
                            grafoDirigidoConPeso.addArco(arco.getOrigen().getNombre(), arco.getDestino().getNombre(), arco.getPeso());
                        }
                        for (Ruta ruta : this.rutas) {
                            this.caminos = grafoDirigidoConPeso.buscarRuta(ruta.getInicio().getNombre(), ruta.getFin().getNombre());
                        }
                    } else {
                        if (this.tipoGrafo.equals("GRAFO_DIRIGIDO_CON_BFS")) {
                            GrafoDirigidoConBFS grafoDirigidoConBFS = new GrafoDirigidoConBFS();
                            for (Nodo nodo : this.nodos) {
                                grafoDirigidoConBFS.addNodo(nodo.getNombre());
                            }
                            for (Arco arco : this.arcos) {
                                grafoDirigidoConBFS.addArco(arco.getOrigen().getNombre(), arco.getDestino().getNombre());
                            }
                            for (Ruta ruta : this.rutas) {
                                this.caminos = grafoDirigidoConBFS.buscarRuta(ruta.getInicio().getNombre(), ruta.getFin().getNombre());
                            }
                        } else {
                            GrafoConBFS grafoConBFS = new GrafoConBFS();
                            for (Nodo nodo : this.nodos) {
                                grafoConBFS.addNodo(nodo.getNombre());
                            }
                            for (Arco arco : this.arcos) {
                                grafoConBFS.addArco(arco.getOrigen().getNombre(), arco.getDestino().getNombre());
                            }
                            for (Ruta ruta : this.rutas) {
                                this.caminos = grafoConBFS.buscarRuta(ruta.getInicio().getNombre(), ruta.getFin().getNombre());
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
