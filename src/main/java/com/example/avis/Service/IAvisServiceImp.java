package com.example.avis.Service;

import com.example.avis.entity.Avis;
import com.example.avis.repos.AvisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IAvisServiceImp implements IAvisService{



    private  final AvisRepository avisRepository;

    @Override
    public Avis addAvis(Avis a){
        return avisRepository.save(a);
    }

    @Override
    public Avis updateAvis(Avis a){
        return avisRepository.save(a);
    }
    @Override
    public List<Avis> retrieveAllAvis(){
        return avisRepository.findAll();
    }

    @Override
    public void removeAvis (Integer idAvis){
        avisRepository.deleteById(idAvis);
    }

    @Override
    public Avis retrieveAvis(Integer idAvis){
        return avisRepository.findById(idAvis).orElse(null);
    }
}
