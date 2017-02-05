<?php

interface Dispositivo {
    function getFabricante();
    function getModelo(); 
}

interface Camara {
    function getCantidadDeMegapixeles();
}

interface Conector {
    function getTipoDeConector();
}

class USAGalaxyS5 implements Dispositivo, Camara,Conector{
	private $fabricante;
	private $modelo; 
	private $cantidadDeMegapixeles;
	private $tipoDeConector; 

	//getters
	function getFabricante() {
        return $fabricante;
    }
    function getModelo() {
        return $modelo;
    }

    function getCantidadDeMegapixeles() {
        return $cantidadDeMegapixeles;
    }
    function getTipoDeConector() {
        return $tipoDeConector;
    }
    ///seters
    function setFabricante($fabricante_in) {
        return $fabricante = $fabricante_in;
    }
    function setModelo($modelo_in) {
        return $modelo = $modelo_in;
    }

    function setCantidadDeMegapixeles($cantidadDeMegapixeles_in) {
        return $cantidadDeMegapixeles= $cantidadDeMegapixeles_in;
    }
    function setTipoDeConector($tipoDeConector_i) {
        return $tipoDeConector = $tipoDeConector_i;
    }

}

///Probando SRP
interface EnviadorDeMensajes
{
	function enviarMensaje($mensaje);
}

class EnviarMensajesPorSMS implements EnviadorDeMensajes
{
	function enviarMensaje($mensaje)
	{
		//Implementacion para enviar menssajes por SMS
	}
}

class EnviarMensajesPorMMS implements EnviadorDeMensajes
{
	function enviarMensaje($mensaje)
	{
		//Implementacion de envio de mensajes por MMS
	}
}



?>