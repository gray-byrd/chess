<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div id="board-container">
    <c:forEach var="row" varStatus="rowNum" items="${board}">
        <div  class="btn-group">
            <c:forEach var="cell" varStatus="colNum" items="${row}">
                <button class="board-btn row-${rowNum.index} col-${colNum.index}"
                        value="row=${rowNum.index}&col=${colNum.index}">${cell.html}</button>
            </c:forEach>
        </div>
    </c:forEach>
</div>
