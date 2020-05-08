<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach var="ee" items="${enq}">
<div>
${ee.cndname}   ${ee.mobno}
</div>
</c:forEach>