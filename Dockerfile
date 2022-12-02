FROM scratch
COPY build/js/packages/kotlin-docker-wasm-wasm/kotlin/kotlin-docker-wasm-wasm.wasm /program.wasm
ENTRYPOINT [ "program.wasm" ]
