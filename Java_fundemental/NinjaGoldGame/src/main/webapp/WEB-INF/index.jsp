<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
        <!DOCTYPE html>
        <html>
            <head>
                <meta charset="UTF-8">
                <link rel="stylesheet"
                    href="/webjars/bootstrap/css/bootstrap.min.css" />

                <title>Insert title here</title>
                  <meta name="viewport" content="width=device-width, initial-scale=1.0">

            </head>
            <body class="w-100">
                <div class="container">
                    <label class="my-3 ">Your Gold<input type="number" class=" mx-4 form-control-sm" disabled value="${gold}"></label>

                    <div class="row mt-5" 
                    <c:if test = "${prison == 1}">
                        onmouseover="myFunction()"
                    </c:if> >
                        <div class="col-md-2">
                            <div class="card">
                                <div class="card-body gap-3 d-flex flex-column align-content-center justify-content-center">
                                    <h5 class="card-title">Farm</h5>
                                    <h6 class="card-subtitle mb-2 text-muted">(earn 10-20 gold)</h6>
                                    <form action="action">
                                        <button type="submit" class="btn btn-primary" name="quest" value="1">Find Gold</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="card">
                                <div class="card-body gap-3 d-flex flex-column align-content-center justify-content-center">
                                    <h5 class="card-title">Cave</h5>
                                    <h6 class="card-subtitle mb-2 text-muted">(earn 5-10 gold)</h6>
                                    <form action="action">
                                        <button type="submit" class="btn btn-primary" name="quest" value="2">Find Gold</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="card">
                                <div class="card-body gap-3 d-flex flex-column align-content-center justify-content-center">
                                    <h5 class="card-title">House</h5>
                                    <h6 class="card-subtitle mb-2 text-muted">(earn 2-5 gold)</h6>
                                    <form action="action">
                                        <button type="submit" class="btn btn-primary" name="quest" value="3">Find Gold</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="card">
                                <div class="card-body gap-3 d-flex flex-column align-content-center justify-content-center">
                                    <h5 class="card-title">Quest</h5>
                                    <h6 class="card-subtitle mb-2 text-muted">(earn/takes 0-50 gold)</h6>
                                    <form action="action">
                                        <button type="submit" class="btn btn-primary" name="quest" value="4">Find Gold</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="card">
                                <div class="card-body gap-3 d-flex flex-column align-content-center justify-content-center">
                                    <h5 class="card-title">Spa</h5>
                                    <h6 class="card-subtitle mb-2 text-muted">(takes 5-20 gold)</h6>
                                    <form action="action">
                                        <button type="submit" class="btn btn-primary" name="quest" value="5">Find Gold</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="card">
                                <div class="card-body gap-3 d-flex flex-column align-content-center justify-content-center">
                                    <h5 class="card-title">Reset</h5>
                                    <h6 class="card-subtitle mb-2 text-muted">(erase and start over)</h6>
                                    <form action="action">
                                        <button type="submit" class="btn btn-danger" name="quest" value="10">Reset</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row mt-5">
                        <h3>Activities</h3>
                    </div>
                    <div class="row mt-5 border border-3 scr">
                        <div class="overflow-scroll" style="height: 30vh;">

                        ${actions}
                    </div>
                    </div>
                </div>
                <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
                <script>
                    function myFunction() {
                      alert("You Still in prison and cant do any quest remained( ${timeInPrisonSeconds}/60)");
                      location.reload();
                    }
                    </script>
            </body>
        </html>