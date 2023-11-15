function cargaDatosEtiqueta(idE) {

	if (idE == 0)
	{	
		document.getElementById("idEtiqueta").value=null;
		document.getElementById("nombre").value=null;
		document.getElementById("desc").value=null;
		return
	}
	
	console.log("aqui ya no");
	
	var identificador="ID" + idE;
	var primerNodo= document.getElementById(identificador);
	
	document.getElementById("nombre").value=primerNodo.textContent;
	
	var nodoHermanoSiguiente = primerNodo.nextSibling;
	var i=0;
	
	document.getElementById("idEtiqueta").value=idE;
	
	while (nodoHermanoSiguiente.textContent != "") {
    	if (nodoHermanoSiguiente.nodeType === 1) {
        // Es un nodo de tipo Element (elemento HTML)
        	switch(i)
        	{
				case 0:
					document.getElementById("nombre").value=nodoHermanoSiguiente.textContent;
				break;
				case 1:
					document.getElementById("desc").value=nodoHermanoSiguiente.textContent;
				break;
			}
			i++;
    	}
    	nodoHermanoSiguiente = nodoHermanoSiguiente.nextSibling;
    }
    
   /*$.ajax({
        type: "GET",
        url: "/editarJuego/" + idJ, // La URL del controlador
        success: function(response) {
            console.log(response)
            //$("#resultado").text("Respuesta del controlador: " + response);
        },
        error: function(error) {
            console.log("Error: " + error)
        }
    });
   */
}


function eliminarEtiqueta(idEtiqueta, nombreEtiqueta) {
	
	Swal.fire({
	  title: '¿Desea eliminar esta etiqueta?',
	  text: "" + nombreEtiqueta,
	  icon: 'warning',
	  showCancelButton: true,
	  confirmButtonColor: '#3085d6',
	  cancelButtonColor: '#d33',
	  cancelButtonText: 'No, conservarla',
	  confirmButtonText: 'Sí, eliminarla'
	}).then((result) => {
		if(result.isConfirmed) {
			fetch(`/eliminarEtiqueta/${idEtiqueta}`, {
		      method: 'POST',
		    })
		    .then(response => response.text()) // Si el servidor devuelve JSON
		    .then(data => {
		      // Manejar la respuesta del servidor aquí
		      Swal.fire(
		        'Deleted!',
		        'Your file has been deleted.',
		        'success'
		      );
		      // Recargar la página después del éxito
      		  window.location.reload();
		    })
		    .catch(error => {
		      // Manejar errores aquí, si es necesario
		      console.error('Error:', error);
		    });
		}
		
	})
	
}