/*
 *  Licensed to GraphHopper and Peter Karich under one or more contributor
 *  license agreements. See the NOTICE file distributed with this work for 
 *  additional information regarding copyright ownership.
 * 
 *  GraphHopper licenses this file to you under the Apache License, 
 *  Version 2.0 (the "License"); you may not use this file except in 
 *  compliance with the License. You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.graphhopper.routing.util.tour;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


/**
 * @author Robin Boldt
 */
public class SinglePointTourTest
{

    @Test
    public void testBasics(){

        SinglePointTour tour = new SinglePointTour(100);
        assertEquals(1, tour.numberOfGeneratedPoints());

        assertTrue(0 <= tour.getBearingForIteration(0));
        assertTrue(360 >= tour.getBearingForIteration(0));

        assertTrue(29 <= tour.getDistanceForIteration(0));
        assertTrue(37 >= tour.getDistanceForIteration(0));
    }

}