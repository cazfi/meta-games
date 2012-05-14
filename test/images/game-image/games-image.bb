
DESCRIPTION = "meta-games layer test image"

IMAGE_INSTALL = "\
task-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} \
freeciv \
"

IMAGE_LINGUAS = " "

LICENSE = "GPL2"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "
