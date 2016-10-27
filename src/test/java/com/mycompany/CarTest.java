package com.mycompany;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by James on 2016/10/26.
 */
public class CarTest {

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }


    @Test
    public void manufacturerIsNull() {
        Car car = new Car(null, "DD-AB-123", 4);
        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1,constraintViolations.size());
        assertEquals("不能为null", constraintViolations.iterator().next().getMessage());
    }


}
