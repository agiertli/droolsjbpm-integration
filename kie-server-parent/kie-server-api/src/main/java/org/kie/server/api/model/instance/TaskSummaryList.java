/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.server.api.model.instance;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.server.api.model.ItemList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "task-summary-list")
public class TaskSummaryList implements ItemList<TaskSummary> {

    @XmlElement(name="task-summary")
    private TaskSummary[] tasks;

    public TaskSummaryList() {
    }

    public TaskSummaryList(TaskSummary[] tasks) {
        this.tasks = tasks;
    }

    public TaskSummaryList(List<TaskSummary> tasks) {
        this.tasks = tasks.toArray(new TaskSummary[tasks.size()]);
    }

    public TaskSummary[] getTasks() {
        return tasks;
    }

    public void setTasks(TaskSummary[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public List<TaskSummary> getItems() {
        return Arrays.asList(tasks);
    }
}
