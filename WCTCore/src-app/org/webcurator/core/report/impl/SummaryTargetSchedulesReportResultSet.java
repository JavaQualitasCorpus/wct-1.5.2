/*
 *  Copyright 2006 The National Library of New Zealand
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.webcurator.core.report.impl;

import java.util.List;
import org.webcurator.core.report.ResultSet;

/**
 * ResultSet for a Summary Target/Groups Schedules Report.
 * @author oakleigh_sk
 */
public class SummaryTargetSchedulesReportResultSet implements ResultSet {

	// Plain text rendering for column names 
	private String[] columnNames;
	
	// HTML rendering for column names
	private String[] columnHTMLNames;
	
	private String[] displayableFields;

	public SummaryTargetSchedulesReportResultSet(String[] columnNames, String[] columnHTMLNames, String[] displayableFields) {
		super();
		this.columnNames = columnNames;
		this.columnHTMLNames = columnHTMLNames;
		this.displayableFields = displayableFields;
	}

	public String[] getColumnHTMLNames() {
		return columnHTMLNames;
	}

	public String[] getColumnNames() {
		return columnNames;
	}

	public String[] getDisplayableFields() {
		return displayableFields;
	}

	public List<Object> getFields() {
		// TODO Auto-generated method stub
		return null;
	}

}
