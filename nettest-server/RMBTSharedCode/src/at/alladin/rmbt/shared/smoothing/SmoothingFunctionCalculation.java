/*******************************************************************************
 * Copyright 2015 alladin-IT GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package at.alladin.rmbt.shared.smoothing;

import java.util.List;

/**
 * 
 * @author lb
 *
 */
public interface SmoothingFunctionCalculation {
	
	/**
	 * calculates the smoothed point at a specific index
	 * @param valueList
	 * @param index
	 * @param dataAmount
	 * @return
	 */
	double smoothXPoint(final List<? extends Smoothable> valueList, final int index, final int dataAmount);
	
	/**
	 * 
	 * @param valueList
	 * @param index
	 * @param dataAmount
	 * @return
	 */
	double smoothYPoint(final List<? extends Smoothable> valueList, final int index, final int dataAmount);
	
	/**
	 * index of the possible first point that can be calculated with this smoothing function
	 * @param valueList
	 * @param dataAmount
	 * @return
	 */
	int getStartingIndex(final List<? extends Smoothable> valueList, final int dataAmount);
	
	/**
	 * index of the possible last point that can be calculated with this smoothing function 
	 * @param valueList
	 * @param dataAmount
	 * @return
	 */
	int getEndingIndex(final List<? extends Smoothable> valueList, final int dataAmount);
}