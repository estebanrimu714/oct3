package com.tcc.apicuertostcc.servicios.implementaciones;

import com.tcc.apicuertostcc.entidades.Zona;
import com.tcc.apicuertostcc.repositorios.Zonarepopsitorio;
import com.tcc.apicuertostcc.servicios.ServicioGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ZonaServicioimp implements ServicioGenerico<Zona> {

    @Autowired
    Zonarepopsitorio zonarepopsitorio;

    @Override
    public List<Zona> buscarTodos() throws Exception {

        try{
            List<Zona> zonas=zonarepopsitorio.findAll();
            return zonas;

        }catch (Exception error){
            throw new Exception(error.getMessage())
        }

    }

    @Override
    public Zona buscarPorId(Integer id) throws Exception {

        try{
            Optional<Zona> zona=zonarepopsitorio.findById(id);
            return zona.get();

        }catch (Exception error){
            throw new Exception(error.getMessage())
        }

    }

    @Override
    public Zona registar(Zona tabla) throws Exception {

        try{
            tabla=zonarepopsitorio-save(tabla);
            return tabla;

        }catch (Exception error){
            throw new Exception(error.getMessage())
        }

    }

    @Override
    public Zona actualizar(Integer id, Zona tabla) throws Exception {

        try{
            Optional<Zona> zonaBuscada=zonarepopsitorio.findById(id);
            Zona zona=zonaBuscada.get();
            zona=zonarepopsitorio.save(tabla);
            return zona;

        }catch (Exception error){
            throw new Exception(error.getMessage())
        }

    }

    @Override
    public Boolean borrar(Integer id) throws Exception {

        try{
            if (zonarepopsitorio.existsById(id)){
                zonarepopsitorio.deleteAllById(id);
                return true;

            }else{

                throw new Exception();

            }

        }catch (Exception error){
            throw new Exception(error.getMessage())
        }

    }
}
