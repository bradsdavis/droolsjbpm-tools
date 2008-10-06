package org.drools.eclipse.flow.ruleflow.view.property.exceptionHandler;
/*
 * Copyright 2005 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.drools.eclipse.flow.common.view.property.EditBeanDialog;
import org.drools.eclipse.flow.common.view.property.EditMapDialog;
import org.drools.process.core.Process;
import org.drools.process.core.context.exception.ActionExceptionHandler;
import org.drools.workflow.core.WorkflowProcess;
import org.eclipse.swt.widgets.Shell;

/**
 * Dialog for editing exception handlers.
 * 
 * @author <a href="mailto:kris_verlaenen@hotmail.com">Kris Verlaenen</a>
 */
public class ExceptionHandlersDialog extends EditMapDialog<String, ActionExceptionHandler> {
    
	private Process process;
	
    protected ExceptionHandlersDialog(Shell parentShell, Process process) {
        super(parentShell, "ExceptionHandlers", ExceptionHandlerDialog.class);
        this.process = process;
    }

    protected ActionExceptionHandler createItem() {
        return new ActionExceptionHandler();
    }

    protected EditBeanDialog<ActionExceptionHandler> createEditItemDialog() {
        return new ExceptionHandlerDialog(getShell(), (WorkflowProcess) process);
    }
    
}
