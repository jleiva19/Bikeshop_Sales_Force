package cl.springlibrary.webapp.service;

import cl.springlibrary.webapp.dto.CategoriesDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoriesService {
    List<CategoriesDto> getCategories();
}
