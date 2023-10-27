package com.example.avis.service;

import com.example.avis.entity.Avis;

import java.util.List;

public interface IAvisService {
    Avis addAvis(Avis a);

    Avis updateAvis(Avis a);

    List<Avis> retrieveAllAvis();

    void removeAvis(Integer idAvis);

    Avis retrieveAvis(Integer idAvis);
}
