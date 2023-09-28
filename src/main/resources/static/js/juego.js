function cargarDatos() {
	var nombreJugador = document.getElementById("nombre").value;

  Swal.fire({
    position: "top-end",
    icon: "success",
    title: `El jugador ${nombreJugador} se ha guardado satisfactoriamente`,
    showConfirmButton: false,
    timer: 4000,
  });
}

function guardarJuego(idJ) {
	var identificador="ID" + idJ;
	var primerNodo= document.getElementById(identificador);
	
	document.getElementById("nombre").value=primerNodo.textContent;
	
	var nodoHermanoSiguiente = primerNodo.nextSibling;
	var i=0;
	
	while (nodoHermanoSiguiente.textContent != "") {
    	if (nodoHermanoSiguiente.nodeType === 1) {
        // Es un nodo de tipo Element (elemento HTML)
        	switch(i)
        	{
				case 0:
					document.getElementById("nombre").value=nodoHermanoSiguiente.textContent;
				break;
				case 1:
					document.getElementById("min_jugadores").value=nodoHermanoSiguiente.textContent;
				break;
				case 2:
					document.getElementById("max_jugadores").value=nodoHermanoSiguiente.textContent;
				break;
			}
			i++;
    	}
    	nodoHermanoSiguiente = nodoHermanoSiguiente.nextSibling;
    }
}


function eliminarJuego(idJuego, nombreJuego) {
	
	Swal.fire({
	  title: '¿Desea eliminar este juego?',
	  text: "" + nombreJuego,
	  icon: 'warning',
	  showCancelButton: true,
	  confirmButtonColor: '#3085d6',
	  cancelButtonColor: '#d33',
	  cancelButtonText: 'No, conservarlo',
	  confirmButtonText: 'Sí, eliminarlo'
	}).then((result) => {
		if(result.isConfirmed) {
			fetch(`/eliminarJuego/${idJuego}`, {
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
		
	  	// Realizar una solicitud AJAX al controlador
	    /*$.ajax({
	      type: 'POST',
	      url: `/eliminar/eliminarJuego/${idJuego}`, // Ruta del controlador
	      success: function (response) {
			  console.log(response);
	        // Manejar la respuesta del servidor aquí
	        Swal.fire(
	          'Deleted!',
	          'Your file has been deleted.',
	          'success'
	        );
	      },
	      error: function (error) {
	        // Manejar errores aquí, si es necesario
	        console.error('Error:', error);
	      }
	    });
	    */
	})
	
}