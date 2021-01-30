package cl.springlibrary.webapp.restcontroller;

import cl.springlibrary.webapp.dto.CategoriesDto;
import cl.springlibrary.webapp.dto.CustomersDto;
import cl.springlibrary.webapp.service.CategoriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategoriesRestController {
    private final CategoriesService categoriesService;

    public CategoriesRestController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping("/categories")
    public List<CategoriesDto> getCategories() {
        return categoriesService.getCategories();
    }
}
