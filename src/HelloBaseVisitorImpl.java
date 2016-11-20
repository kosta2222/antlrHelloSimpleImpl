import org.antlr.v4.runtime.misc.NotNull;

public class HelloBaseVisitorImpl extends HelloBaseVisitor<Integer> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Integer visitR(@NotNull HelloParser.RContext ctx) { //return visitChildren(ctx);
    int value=ctx.ID().getText().length(); 
return value;
        }
}