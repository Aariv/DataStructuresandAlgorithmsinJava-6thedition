/*
 * Copyright 2019, Arivazhagan L.
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * 
 */
package com.dsalgo.chapter15.memory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zentere
 *
 */
public class Price {

	private Map<String, Double> rates;

	private Double value;

	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String, Double>();
		rates.put("USD", 1d);
		rates.put("GCP", 0.6);
		rates.put("EUR", 0.8);
	}

	// TODO: muting a value
	public Double convert(String toCurrency) {
		if (toCurrency.equals("USD"))
			return value;
		else {
			Double converstion = rates.get("USD") / rates.get(toCurrency);
			value = converstion * value;
			return value;
		}
	}

	@Override
	public String toString() {
		return this.value.toString();
	}

	// TODO: Esacaping reference
	public Map<String, Double> getRates() {
		return rates;
	}
}
