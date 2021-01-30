package cl.springlibrary.webapp.service;

import cl.springlibrary.webapp.dto.CategoriesDto;
import cl.springlibrary.webapp.mapper.CategoriesMapper;
import cl.springlibrary.webapp.mapper.OrdersMapper;
import cl.springlibrary.webapp.repository.CategoriesRepository;
import cl.springlibrary.webapp.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    private final CategoriesMapper categoriesMapper;
    private final CategoriesRepository categoriesRepository;

    public CategoriesServiceImpl(CategoriesMapper categoriesMapper, CategoriesRepository categoriesRepository) {
        this.categoriesMapper = categoriesMapper;
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public List<CategoriesDto> getCategories() {
        return categoriesRepository.findAll()
                .stream()
                .map(categoriesMapper::entityToDto)
                .collect(Collectors.toList()); }
}
