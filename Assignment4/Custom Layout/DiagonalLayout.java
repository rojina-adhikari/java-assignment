import java.awt.*;
 
public class DiagonalLayout implements LayoutManager {
    private int vgap;
    private int minWidth = 0, minHeight = 0;
    private int preferredWidth = 0, preferredHeight = 0;
    private boolean sizeUnknown = true;
 
    public DiagonalLayout() {
        this(5);
    }
 
    public DiagonalLayout(int v) {
        vgap = v;
    }
 
    /* Required by LayoutManager. */
    public void addLayoutComponent(String name, Component comp) {
    }
 
    /* Required by LayoutManager. */
    public void removeLayoutComponent(Component comp) {
    }
 
    private void setSizes(Container parent) {
        int nComps = parent.getComponentCount();
        Dimension d = null;
 
        //Reset preferred/minimum width and height.
        preferredWidth = 0;
        preferredHeight = 0;
        minWidth = 0;
        minHeight = 0;
 
        for (int i = 0; i < nComps; i++) {
            Component c = parent.getComponent(i);
            if (c.isVisible()) {
                d = c.getPreferredSize();
 
                if (i > 0) {
                    preferredWidth += d.width/2;
                    preferredHeight += vgap;
                } else {
                    preferredWidth = d.width;
                }
                preferredHeight += d.height;
 
                minWidth = Math.max(c.getMinimumSize().width,
                                    minWidth);
                minHeight = preferredHeight;
            }
        }
    }
 
 
    /* Required by LayoutManager. */
    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        int nComps = parent.getComponentCount();
 
        setSizes(parent);
 
        //Always add the container's insets!
        Insets insets = parent.getInsets();
        dim.width = preferredWidth
                    + insets.left + insets.right;
        dim.height = preferredHeight
                     + insets.top + insets.bottom;
 
        sizeUnknown = false;
 
        return dim;
    }
 s