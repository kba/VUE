/*
 * -----------------------------------------------------------------------------
 *
 * <p><b>License and Copyright: </b>The contents of this file are subject to the
 * Mozilla Public License Version 1.1 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at <a href="http://www.mozilla.org/MPL">http://www.mozilla.org/MPL/.</a></p>
 *
 * <p>Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.</p>
 *
 * <p>The entire file consists of original code.  Copyright &copy; 2003, 2004 
 * Tufts University. All rights reserved.</p>
 *
 * -----------------------------------------------------------------------------
 */

package tufts.vue;

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class SelectionTool extends VueTool {

    public SelectionTool() {
        super();
    }

    public boolean handleKeyPressed(java.awt.event.KeyEvent e)  {
        return false;
    }
	
    public JPanel getContextualPanel() {
        return VueToolbarController.getController().getSuggestedContextualPanel();
    }

    public boolean supportsSelection() { return true; }

    static class Direct extends SelectionTool {
        public PickContext initPick(PickContext pc, float x, float y) {
            pc.pickDepth = 1;
            return pc;
        }
    }
    
}
