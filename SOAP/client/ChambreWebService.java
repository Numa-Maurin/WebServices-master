
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;



@WebService(name = "ChambreWebService", targetNamespace = "http://localhost:10000/ReservationVoyage")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ChambreWebService {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reserverChambre", targetNamespace = "http://localhost:10000/ReservationVoyage", className = "client.ReserverChambre")
    @ResponseWrapper(localName = "reserverChambreResponse", targetNamespace = "http://localhost:10000/ReservationVoyage", className = "client.ReserverChambreResponse")
    @Action(input = "http://localhost:10000/ReservationVoyage/ChambreWebService/reserverChambreRequest", output = "http://localhost:10000/ReservationVoyage/ChambreWebService/reserverChambreResponse")
    public String reserverChambre(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "afficherChambresJSON", targetNamespace = "http://localhost:10000/ReservationVoyage", className = "client.AfficherChambresJSON")
    @ResponseWrapper(localName = "afficherChambresJSONResponse", targetNamespace = "http://localhost:10000/ReservationVoyage", className = "client.AfficherChambresJSONResponse")
    @Action(input = "http://localhost:10000/ReservationVoyage/ChambreWebService/afficherChambresJSONRequest", output = "http://localhost:10000/ReservationVoyage/ChambreWebService/afficherChambresJSONResponse")
    public String afficherChambresJSON();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "afficherChambres", targetNamespace = "http://localhost:10000/ReservationVoyage", className = "client.AfficherChambres")
    @ResponseWrapper(localName = "afficherChambresResponse", targetNamespace = "http://localhost:10000/ReservationVoyage", className = "client.AfficherChambresResponse")
    @Action(input = "http://localhost:10000/ReservationVoyage/ChambreWebService/afficherChambresRequest", output = "http://localhost:10000/ReservationVoyage/ChambreWebService/afficherChambresResponse")
    public String afficherChambres();

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "creerChambres", targetNamespace = "http://localhost:10000/ReservationVoyage", className = "client.CreerChambres")
    @ResponseWrapper(localName = "creerChambresResponse", targetNamespace = "http://localhost:10000/ReservationVoyage", className = "client.CreerChambresResponse")
    @Action(input = "http://localhost:10000/ReservationVoyage/ChambreWebService/creerChambresRequest", output = "http://localhost:10000/ReservationVoyage/ChambreWebService/creerChambresResponse")
    public void creerChambres();

}
