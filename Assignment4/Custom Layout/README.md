##Custom layout
//creating a custom layout manager
Before you start creating a custom layout manager, make sure that no existing layout manager meets your requirements. In particular, layout managers such as GridBagLayout, SpringLayout, and BoxLayout are flexible enough to work in many cases. You can also find layout managers from other sources, such as from the Internet. Finally, you can simplify layout by grouping components into containers such as panels.

To create a custom layout manager, you must create a class that implements the LayoutManager interface. You can either implement it directly, or implement its subinterface,

Every layout manager must implement at least the following five methods, which are required by the LayoutManager interface:

void addLayoutComponent(String, Component)
Called by the Container class's add methods. Layout managers that do not associate strings with their components generally do nothing in this method.
void removeLayoutComponent(Component)
Called by the Container methods remove and removeAll. Layout managers override this method to clear an internal state they may have associated with the Component.
Dimension preferredLayoutSize(Container)
Called by the Container class's getPreferredSize method, which is itself called under a variety of circumstances. This method should calculate and return the ideal size of the container, assuming that the components it contains will be at or above their preferred sizes. This method must take into account the container's internal borders, which are returned by the getInsets method.
Dimension minimumLayoutSize(Container)
Called by the Container getMinimumSize method, which is itself called under a variety of circumstances. This method should calculate and return the minimum size of the container, assuming that the components it contains will be at or above their minimum sizes. This method must take into account the container's internal borders, which are returned by the getInsets method.
void layoutContainer(Container)
Called to position and size each of the components in the container. A layout manager's layoutContainer method does not actually draw components. It simply invokes one or more of each component's setSize, setLocation, and setBounds methods to set the component's size and position.
This method must take into account the container's internal borders, which are returned by the getInsets method. If appropriate, it should also take the container's orientation (returned by the getComponentOrientation method) into account. You cannot assume that the preferredLayoutSize or minimumLayoutSize methods will be called before layoutContainer is called.