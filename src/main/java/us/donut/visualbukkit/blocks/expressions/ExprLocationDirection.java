package us.donut.visualbukkit.blocks.expressions;

import org.bukkit.Location;
import org.bukkit.util.Vector;
import us.donut.visualbukkit.blocks.ExpressionBlock;
import us.donut.visualbukkit.blocks.annotations.Category;
import us.donut.visualbukkit.blocks.annotations.Description;
import us.donut.visualbukkit.blocks.syntax.SyntaxNode;

@Category("Location")
@Description({"A unit-vector in the direction of a location's yaw/pitch", "Returns: vector"})
public class ExprLocationDirection extends ExpressionBlock<Vector> {

    @Override
    protected SyntaxNode init() {
        return new SyntaxNode("direction of", Location.class);
    }

    @Override
    public String toJava() {
        return arg(0) + ".getDirection()";
    }
}