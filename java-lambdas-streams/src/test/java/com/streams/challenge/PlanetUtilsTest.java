package com.streams.challenge;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class PlanetUtilsTest {

    private List<Planet> planets = SolarSystem.getPlanets();
    private PlanetUtils planetUtils = new PlanetUtils();

    @Test
    public void testTwoPlanetsStartWithM() {
        List<Planet> actual = planetUtils.getPlanetsBeginningWithM(planets);
        assertThat(actual, hasSize(2));

        assertThat(actual, contains(hasProperty("name", is(equalTo("Mercury"))), hasProperty("name", is(equalTo("Mars")))));
        
    }

    @Test
    public void testThreePlanetsWithDensityGreaterThanFive() {
        List<Planet> actual = planetUtils.getPlanetsWithDensityGreaterThanFive(planets);
        assertThat(actual, hasSize(3));
        assertThat(actual, contains(hasProperty("name", is(equalTo("Mercury"))),
                hasProperty("name", is(equalTo("Venus"))),
                hasProperty("name", is(equalTo("Earth")))));
    }

    @Test
    public void testFourPlanetsHaveMoreThanThreeMoons() {
        List<Planet> actual = planetUtils.getPlanetsWithMoreThanThreeMoons(planets);
        assertThat(actual, hasSize(4));

        assertThat(actual, contains(hasProperty("name", is(equalTo("Jupiter"))),
                hasProperty("name", is(equalTo("Saturn"))),
                hasProperty("name", is(equalTo("Uranus"))),
                hasProperty("name", is(equalTo("Neptune")))));
    }

    @Test
    public void testFourPlanetsHaveRings() {
        List<Planet> actual = planetUtils.getPlanetsWithRings(planets);
        assertThat(actual, hasSize(4));
        
        assertThat(actual, contains(hasProperty("name", is(equalTo("Jupiter"))),
                hasProperty("name", is(equalTo("Saturn"))),
                hasProperty("name", is(equalTo("Uranus"))),
                hasProperty("name", is(equalTo("Neptune")))));
    }
}
