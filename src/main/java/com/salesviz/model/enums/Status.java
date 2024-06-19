package com.salesviz.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
@Getter
public enum Status {
    WAITING("Ожидание"),
    PROCESSED("Обрабатывается"),
    CONFIRMED("Подтверждено"),
    REJECTED("Отклонено"),
    PAID("Оплачено"),
    DELIVERED("Доставлено");

    private final String name;
}

