/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2004-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */

package org.geotools.filter.text.ecql;

import org.geotools.filter.text.commons.Language;
import org.geotools.filter.text.cql2.CQLAttributeNameTest;
import org.geotools.filter.text.cql2.CQLException;
import org.junit.Test;

/**
 * Test case for Attribute Name
 * <p>
 * <pre>
 * @see CQLAttributeNameTest
 * </pre>
 * </p>
 *
 * @author Mauricio Pazos (Axios Engineering)
 * @since 2.7
 *
 *
 *
 */
public class ECQLAttributeNameTest extends CQLAttributeNameTest {
    public ECQLAttributeNameTest() {
        super(Language.ECQL);
    }

    @Test
    public void spacesInAttributeName() throws CQLException {

        testAttributeBetweenDoubleQuotes("\"población general\"");
        testAttributeBetweenDoubleQuotes("\"statut de diffusion de l'établissement\"");
    }
}
