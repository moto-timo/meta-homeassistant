SUMMARY = "DTLSSocket is a cython wrapper for tinydtls with a Socket like interface"
HOMEPAGE = "https://git.fslab.de/jkonra2m/tinydtls-cython"
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f496e8f7ed80c27693661195ebd8526"

SRC_URI += "file://0001-Pass-configure-options-from-bitbake.patch"

inherit pypi setuptools3

PYPI_PACKAGE = "DTLSSocket"

DEPENDS += "${PYTHON_PN}-cython-native"

CONFIGUREOPTS = " --build=${BUILD_SYS} --host=${HOST_SYS} --target=${TARGET_SYS}"
export CONFIGUREOPTS

SRC_URI[md5sum] = "6ae135d77a7d4b986d56728bab47f658"
SRC_URI[sha256sum] = "e05157155e79ebb70e345a9a193cf285f2589ed38436cb3feda0766a31ae75a5"
