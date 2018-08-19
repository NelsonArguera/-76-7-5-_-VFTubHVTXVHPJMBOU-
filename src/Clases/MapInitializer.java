/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import com.sun.org.apache.xerces.internal.impl.dv.xs.DoubleDV;
import com.teamdev.jxmaps.ControlPosition;
import com.teamdev.jxmaps.DirectionsLeg;
import com.teamdev.jxmaps.DirectionsRequest;
import com.teamdev.jxmaps.DirectionsResult;
import com.teamdev.jxmaps.DirectionsRoute;
import com.teamdev.jxmaps.DirectionsRouteCallback;
import com.teamdev.jxmaps.DirectionsStatus;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.MapOptions;
import com.teamdev.jxmaps.MapReadyHandler;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.MapTypeControlOptions;
import com.teamdev.jxmaps.swing.MapView;
import com.teamdev.jxmaps.Map;
import com.teamdev.jxmaps.TravelMode;
import javax.swing.JOptionPane;
import expo.Maps;

/**
 *
 * @author Enrique
 */
public class MapInitializer extends MapView{

    /**
     * @return the distanc
     */
    public double getDistanc() {
        return distanc;
    }
    /**
     * @return the lugar_inicio
     */
    public String getLugar_inicio() {
        return lugar_inicio;
    }

    /**
     * @param lugar_inicio the lugar_inicio to set
     */
    public void setLugar_inicio(String lugar_inicio) {
        this.lugar_inicio = lugar_inicio;
    }

    /**
     * @return the lugar_destino
     */
    public String getLugar_destino() {
        return lugar_destino;
    }

    /**
     * @param lugar_destino the lugar_destino to set
     */
    public void setLugar_destino(String lugar_destino) {
        this.lugar_destino = lugar_destino;
    }

        private String lugar_inicio;
        private String lugar_destino;
        private double distanc;

    public MapInitializer(){
        
        //Handler que indica que el mapa a terminado de cargar correctamente
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus ms) {
                //Chequea si el mapa a cargado correctamente
                if (ms == MapStatus.MAP_STATUS_OK ) {
                    //Obteniendo el objeto final del map
                    final Map map = getMap();
                    //Creando una lista de opciones para que cargue el mapa
                    MapOptions mapOptions = new MapOptions(map);
                    //Creando el tipo de controles para el mapa
                    MapTypeControlOptions controlOptions = new MapTypeControlOptions(map);
                    //Setear la posicion de los controles dentro del componente del mapa
                    controlOptions.setPosition(ControlPosition.TOP_RIGHT);
                    //Agregando la opcion de controles a mapOptions
                    mapOptions.setMapTypeControlOptions(controlOptions);
                    //Seteando la opcion de los controles dentro del mapa
                    map.setOptions(mapOptions);
                    //Seteando la posicion que desplegara el mapa Por default sera EL Salvador
                    map.setCenter(new LatLng(13.735937, -89.289627));
                    //Zoom
                    map.setZoom(13);
                    
                    calcularDireccion();
                }
            }
        });
    }
    public void calcularDireccion(){
        
        //Obtener el objeto asociado
        final Map map = getMap();
        //Creando una peticion de direcciones para el mapa
        DirectionsRequest dr = new DirectionsRequest();
        //Asignando el origen
        dr.setOriginString(getLugar_inicio());
        //Asignando el destino 
        dr.setDestinationString(getLugar_destino());
        //Asignando el modo de viaje
        dr.setTravelMode(TravelMode.DRIVING);
        //Calculando la linea para que se unan los 2 puntos
        getServices().getDirectionService().route(dr, new DirectionsRouteCallback(map) {
            @Override
            public void onRoute(DirectionsResult dr, DirectionsStatus ds) {
                
                if (ds == DirectionsStatus.OK) {
                    //Dibujando la linea 
                    map.getDirectionsRenderer().setDirections(dr);
                    
                    DirectionsRoute[] route = dr.getRoutes();

                    if (route.length>0) {
                       double distancia = 0;
                        for (DirectionsLeg leg: route[0].getLegs())
                            distancia += leg.getDistance().getValue();
                           
                        System.out.println("Distancia ="+ distancia+ " Km" );
                        distanc = distancia;
                    }
                   
                }
                else{
                    JOptionPane.showMessageDialog(MapInitializer.this, "Los sitios no pueden ser localizados, Ingrese un sitio correcto", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
                }
                
            }
        });
    }

    

    }
