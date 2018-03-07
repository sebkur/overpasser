package hu.supercluster.overpasser.library.query;

import hu.supercluster.overpasser.library.output.OutputFormat;
import hu.supercluster.overpasser.library.output.OutputModificator;
import hu.supercluster.overpasser.library.output.OutputOrder;
import hu.supercluster.overpasser.library.output.OutputVerbosity;

public class Test {

	public static void main(String[] args) {
		 String result = new OverpassQuery()
	                .format(OutputFormat.XML)
	                .timeout(30)
	                .filterQuery()
	                    .node()
	                        .amenity("parking")
	                        .tagNot("access", "private")
	                        .boundingBox(
	                                47.48047027491862, 19.039797484874725,
	                                47.51331674014172, 19.07404761761427
	                        )
	                    .prepareNext()
	                    .way()
	                        .amenity("parking")
	                        .tagNot("access", "private")
	                        .boundingBox(
	                                47.48047027491862, 19.039797484874725,
	                                47.51331674014172, 19.07404761761427
	                        )
	                    .prepareNext()
	                    .rel()
	                        .amenity("parking")
	                        .tagNot("access", "private")
	                        .boundingBox(
	                                47.48047027491862, 19.039797484874725,
	                                47.51331674014172, 19.07404761761427
	                        )
	                .end()
	                .output(OutputVerbosity.BODY, OutputModificator.CENTER, OutputOrder.QT, 100)
	                .build()
	        ;
		 System.out.println(result);
	}

}
